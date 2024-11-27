# The Platform Specification Java Model

https://platformspec.io/docs/spec/sdks.html


## Testing

### import CRDs

Check out the repository and install the CRDs on your k8s cluster accordingly:

```
https://github.com/verticle-io/platformspec-model-java.git
```
```
kubectl apply -f ./platformspec-model-java/crd
```

### import test data

```
kubectl apply -f ./platformspec-model-java/src/test/resource/platform.yaml
```