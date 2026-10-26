import hmac
import hashlib
import json

shared_key = "Kaafc"

# 1. hashes the document
hmac_sha256 = hmac.new(shared_key.encode("utf-8"), digestmod=hashlib.sha256)
message = b'this is secret'
hmac_sha256.update(message)
hash_value = hmac_sha256.hexdigest()

#Hash value accompanies document in transit
authenticated_msg={
    'msg': list(message),
    'hash_value': hash_value,
}
outbound_msg = json.dumps(authenticated_msg)


print(outbound_msg)