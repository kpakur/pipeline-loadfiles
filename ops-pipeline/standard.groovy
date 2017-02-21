#!groovy

def s(){
    stage("S1") {
        node {
            echo '============= BRANCH=' + branchName
            echo '============= BUILD NUMBER=' + buildNumber
            echo '============= BUILD VERSION=' + buildVersion
            echo '============= commit id=' + commitId
        }
    }
}

def sMod(){
    stage("SMod") {
        buildVersion = 'mod in St in stage not node'
        node {
            branchName = 'md in ST and in node'
            echo '============= BRANCH=' + branchName
            echo '============= BUILD NUMBER=' + buildNumber
            echo '============= BUILD VERSION=' + buildVersion
            echo '============= commit id=' + commitId
        }
    }
}

return this;