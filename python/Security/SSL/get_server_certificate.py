import ssl

address = ('luquyrp.com', 443)
certificate = ssl.get_server_certificate(address)
print(certificate)

# python get_server_certificate.py > wikipedia.crt