## PathfinderLib (API)
[PathfinderLib](https://github.com/kuripasanda/PathfinderLib) (プライベートリポジトリ) のAPI部分のコードを公開するためのリポジトリです。

## 使い方
JitPackから依存関係を追加してください。  
```kotlin
repositories {
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("com.github.kuripasanda:pathfinderlib-api:1.0.3")
}
```
  
KotlinでAPIのインスタンスを取得
```kotlin
var pathfinderLib: PathfinderLibApi? = null

override fun onInitialize() {
    // PathfinderLibのAPIを取得
    pathfinderLib = PathfinderLibApi.getApi()
}
```
