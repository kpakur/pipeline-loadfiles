#!groovy

//testing global variables

globv = 'none'
pSt = null;
ut = null;

echo '============= globv=' + globv

stage('checkout'){
	node {
		checkout scm
		pSt = load('ops-pipeline/standard.groovy')
		ut = load('ops-pipeline/utils.groovy')
	}
}


pSt.standardP()
