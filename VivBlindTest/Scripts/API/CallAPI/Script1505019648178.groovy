import groovy.json.JsonSlurper
import groovy.json.StreamingJsonBuilder

def login = [
	username: "pettawanmju09@gmail.com",
	password: "pettawan123456",
	type: "normal"
]

def createIssues = [
	"assigned_to": null,
	"blocked_note": "blocking reason",
	"description": "Implement API CALL",
	"is_blocked": false,
	"is_closed": false,
	"milestone": null,
	"priority": 660828,
	"project": 219742,
	"severity": 1097638,
	"status": 1540655,
	"subject": "Test Add Call API Customer personal data",
	"tags": [
		"service catalog",
		"customer"
	],
	"type": 664207,
	"watchers": []
	]

def urllogin = new URL("https://api.taiga.io/api/v1/auth")
def connentloign = urllogin.openConnection().with {
	requestMethod = "POST"
	doOutput = true
	setRequestProperty("Content-Type", "application/json;charset=UTF-8")
	outputStream.withWriter("UTF-8") { new StreamingJsonBuilder(it, login) }
	new JsonSlurper().parse(inputStream.newReader("UTF-8"))
}

def urlsIssues = new URL("https://api.taiga.io/api/v1/issues")
def connentIssues = urlsIssues.openConnection().with {
	requestMethod = "POST"
	doOutput = true
	setRequestProperty("Content-Type", "application/json;charset=UTF-8")
	setRequestProperty("Authorization", "bearer:"+connentloign.auth_token)
	outputStream.withWriter("UTF-8") { new StreamingJsonBuilder(it, createIssues) }
	new JsonSlurper().parse(inputStream.newReader("UTF-8"))
}

println "connentIssues ==="+connentIssues
//ยังทำไม่ได้ในส่วนนี้

