pipeline {
	agent any

// 	environment {
// 		mavenHome = tool 'jenkins-maven'
// 	}

// 	tools {
// 		jdk 'java-17'
// 	}

	stages {

		stage('Build'){
			steps {
				echo "Build stage"
				bat "./gradlew build -DskipTests"
			}
		}

		stage('Test'){
			steps{
				echo "Test stage"
				bat "./gradlew test"
			}
		}

		stage('Deploy') {
			steps {
			    echo "Deploy stage empty for now"
			}
		}
	}
}