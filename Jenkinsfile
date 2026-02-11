pipeline {
    agent any
    
    parameters {
	    choice(
	        name: 'ENVIRONMENT',
	        choices: ['QA1', 'QA3'],
	        description: 'This parameter is used for passing the environment value at the time of build trigger'
	    )
	}
	
    tools {
        maven 'Maven 3.9.9'
        jdk 'JDK21'
    }
    
    environment {
        API_KEY = credentials('MY_API_KEY')
        SAUCEDEMO_USER_NAME = credentials('SAUCEDEMO_USER_NAME')
        SAUCEDEMO_USER_PWD = credentials('SAUCEDEMO_USER_PWD')
    }

    stages {
         stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Run TestNG') {
            steps {				
                bat 'mvn clean test -Dsurefire.suiteXmlFiles=testng.xml -Denv=${ENVIRONMENT} -DdemoSauce.password=%SAUCEDEMO_USER_PWD%'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
            
            // Archive reports (like GitHub artifact)
            archiveArtifacts artifacts: 'target/cucumber-html-report*', fingerprint: true
            
            publishHTML([
              reportDir: 'target',
              reportFiles: 'cucumber-html-report.html',
              reportName: 'Cucumber HTML Report',
              keepAll: true,
              alwaysLinkToLastBuild: true,
              allowMissing: false
            ])
        
        }
              
		success {
            emailext (
                to: 'vijeth2011@gmail.com',
                subject: "SUCCESS: ${env.JOB_NAME} Build #${env.BUILD_NUMBER}",
                body: """
         Build Successful
         
         Job: ${env.JOB_NAME}
         Build: ${env.BUILD_NUMBER}
         Environment: ${params.ENVIRONMENT}
         
         Report link:
          ${env.BUILD_URL}artifact/target/cucumber-html-report.html

         Cucumber report attached.
         """,
            attachmentsPattern: 'target/cucumber-html-report*'
            )
        }
        
        failure {
            emailext (
                to: 'vijeth2011@gmail.com',
                subject: "FAILURE: ${env.JOB_NAME} Build #${env.BUILD_NUMBER}",
                body: "Build failed. Please check the console output."
            )
        }
    }
}