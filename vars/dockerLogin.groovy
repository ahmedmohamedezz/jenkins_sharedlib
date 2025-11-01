def call(String user, String credId) {
    withCredentials([string(credentialsId: credId, variable: 'PASS')]) {
        sh "echo $PASS | docker login -u ${user} --password-stdin"
    }
}
