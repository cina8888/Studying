# Get certificate

1. Open cmd
2. Change dir to your project

```
openssl req -x509 -newkey rsa:4096 -nodes -keyout key.pem -out cert.pem -days 365
```

3. Install practice project Alive Django

```py
pip install django
```

4. create alice

```py
django-admin startproject alice
```

5. Fake openssl for window

```py
pip install django-extensions Werkzeug  
```

6. Install openssl for window

```py
pip install pyOpenSSL 
```

7. cd alice and run server with

```py
python manage.py runserver_plus --cert-file ..\certificate.pem --key-file ..\private_key.pem 8443
```