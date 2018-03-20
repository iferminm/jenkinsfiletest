#!/usr/bin/env groovy

pipeline {
    stages {
        stage('Test') {
            steps {
                echo "This is just a test"
            }
        }
    }
}

return this
