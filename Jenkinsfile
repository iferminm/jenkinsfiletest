#!/usr/bin/env groovy
@Library('PipelineLibrary')
import com.project.LogUtils

pipeline {
    stages {
        stage('Test') {
            steps {
                echo "This is just a test"
            }
        }
        stage('Stage 2') {
            steps {
                testFunction()
            }
        }
        stage('Test library function') {
            steps {
                sayHello()
            }
        }
        stage('Test library class') {
            steps {
                script {
                    echo LogUtils.log('This is a log message')
                }
            }
        }
    }
}

def testFunction() {
    echo "${env.VarOne} ${env.VarTwo}"
}
