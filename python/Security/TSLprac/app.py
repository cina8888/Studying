# run with cert

from flask import Flask

app = Flask(__name__)

@app.route('/')
def hello():
    return "HTTPS with Python"

if __name__ == '__main__':
    app.run(port=8084, ssl_context=('cert.pem', 'key.pem'))