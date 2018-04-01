#!/usr/bin/env groovy

def start() {
    stage('test') {
        println "REMOTEANDO ${env.PROJECT_TYPE}" 
    }
    stage('test library function') {
        try {
            sayHello()
        } catch(e) {
            throw e
        }
    }
    stage {
        script {
            echo check("Jenkinsfile")
        }
    }
    stage('Publishing to slack') {
        slackLogger.info("This is info")
        slackLogger.warning("This is warning")
        slackLogger.failure("This is failure")
        slackLogger.success("This is success")
    }
}


return this
