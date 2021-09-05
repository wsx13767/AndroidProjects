# AndroidProjects
android project demo

## Kotlin 

### Lambda

```kotlin
Thread(object : Runnable {
  override fun run() {
    println("Thread is running")
  }
}).start()
// 簡化
Thread(Runnable {
  println("Thread is running")
}).start()
// 簡化
Thread({
  println("Thread is running")
}).start()
// 簡化
Thread {
  println("Thread is running")
}.start()
```



## Activity

### launchMode

| value | 描述 |
| -------------- | :--------------------------------------- |
| standard | 預設，直接create新的Activity |
| singleTop      | 如果自己在最上層，就不會重新create       |
| singleTask     | 如果已經create且還存在，就會直接拿來使用 |
| singleInstance | 於新的task起一個activity，當返回時，返回至最後一個task的activity |

