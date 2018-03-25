#!/usr/bin/env groovy

def start() {
    try {
        stage('test') {
            println "REMOTEANDO ${env.PROJECT_TYPE}" 
        }
        stage('test library function') {
            sayHello()
        }
        stage('Publishing to slack') {
            slackLogger.info("This is info")
            slackLogger.warning("This is warning")
            slackLogger.failure("This is failure")
            slackLogger.success("This is success")
        }
    catch(err) {
        throw err
    }
}


return this
