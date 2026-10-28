# On Linux

1. Generate private key

```
$ openssl genpkey -algorithm RSA \
-out private_key.pem \
-pkeyopt rsa_keygen_bits:3072
```

2. Get public key

```
openssl rsa -pubout -in private_key.pem -out public_key.pem
```


3. Change mode

```
$ chmod 600 private_key.pem
$ chmod 644 public_key.pem
```

# On Window

1. Generate private key RSA


```bash
openssl genpkey -algorithm RSA -out private_key.pem -pkeyopt rsa_keygen_bits:4096
```

2. Get public key

```bash
openssl rsa -in private_key.pem -pubout -out public_key.pem
```




