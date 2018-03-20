#!/usr/bin/env groovy


def start() {
    stage('test') {
        steps {
            step {
               println "REMOTEANDO" 
            }
        }
    }
}


return this
