def call(String image, String tag) {
    sh """
    docker stop python-app || true
    docker rm python-app || true
    docker run -d -p 9000:8080 --name python-app ${image}:${tag}
    """
}
