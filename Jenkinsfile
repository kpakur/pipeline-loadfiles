#!groovy

//testing global variables

commitId = ''
branchName = BRANCH_NAME
buildNumber = BUILD_NUMBER
buildVersion = "0.${BUILD_NUMBER}.0.0"

echo '============= BRANCH=' + branchName
echo '============= BUILD NUMBER=' + buildNumber
echo '============= BUILD VERSION=' + buildVersion

stage('restart now'){
	input message: 'Restarted?'
}

stage("js2") {
	node {
		echo '============= BRANCH=' + branchName
		echo '============= BUILD NUMBER=' + buildNumber
		echo '============= BUILD VERSION=' + buildVersion
		echo '============= commit id=' + commitId
	}
}


stage('checkout'){
	node {
		checkout scm
		pSt = load('ops-pipeline/standard.groovy')
		ut = load('ops-pipeline/utils.groovy')
	}
}

stage("js1") {
	node {
		echo '============= BRANCH=' + branchName
		echo '============= BUILD NUMBER=' + buildNumber
		echo '============= BUILD VERSION=' + buildVersion
		echo '============= commit id=' + commitId
	}
}


ut.s()
pSt.s()

buildNumber = 'mod outside stage and node main'

stage("js2") {
	buildVersion = 'mod in main in stage not node'
	node {
		branchName = 'md in main and in node'
		echo '============= BRANCH=' + branchName
		echo '============= BUILD NUMBER=' + buildNumber
		echo '============= BUILD VERSION=' + buildVersion
		echo '============= commit id=' + commitId
	}
}

ut.s()
pSt.s()

stage('restart now'){
	input message: 'Restarted?'
}

stage("js2") {
	node {
		echo '============= BRANCH=' + branchName
		echo '============= BUILD NUMBER=' + buildNumber
		echo '============= BUILD VERSION=' + buildVersion
		echo '============= commit id=' + commitId
	}
}
ut.s()
pSt.s()

ut.sMod()
stage("js mod in ut") {
	node {
		echo '============= BRANCH=' + branchName
		echo '============= BUILD NUMBER=' + buildNumber
		echo '============= BUILD VERSION=' + buildVersion
		echo '============= commit id=' + commitId
	}
}

pSt.s()

pSt.sMod()

ut.s()