from flask import Flask
app = Flask(__name__)

@app.route('/message')
def message():
    return "Hello meghraj"

app.run(host='0.0.0.0', port=5000)
