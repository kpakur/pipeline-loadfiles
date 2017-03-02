#!groovy

def standardP(){
    stage("Print Gl before") {
        node {
            ut.printGlobV('before')
        }
    }

    stage('restart now'){
        input message: 'Restarted?'
    }

    stage("Print Gl after") {
        node {
            ut.printGlobV('after')
        }
    }
}

return this;