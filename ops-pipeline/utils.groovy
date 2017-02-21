#!groovy

def s(){
    stage("U1") {
        node {
            echo '============= BRANCH=' + branchName
            echo '============= BUILD NUMBER=' + buildNumber
            echo '============= BUILD VERSION=' + buildVersion
            echo '============= commit id=' + commitId
        }
    }
}

def sMod(){
    stage("UMod") {
        buildVersion = 'mod in UT in stage not node'
        node {
            branchName = 'md in UT and in node'
            echo '============= BRANCH=' + branchName
            echo '============= BUILD NUMBER=' + buildNumber
            echo '============= BUILD VERSION=' + buildVersion
            echo '============= commit id=' + commitId
        }
    }
}

return this;