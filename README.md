# 実装するプログラム内容
Spring Boot for GraphQLが公式で出しているコードを変更・拡張する形で実装
- GraphQLのクエリから本(Book)の情報および本の著者(Author)の情報を取得するサーバの構築するサンプルコード
    - 参考URL: https://spring.pleiades.io/guides/gs/graphql-server/
## 変更点
- Controller, Service, Repository層の3層アーキテクチャによる実装に変更
- 各層のデータのやり取りをDTOによって行うように変更
- エラーに関するコードの追加

# 環境
- JDK: OpenJDK 17
- Spring Boot: 3.1.5
- gradle: 8.4

# 実行方法
1. 以下のコマンドを実行
    ~~~shell
    ./gradlew BootRun
    ~~~
2. 以下のアドレスをウェブブラウザ上から開く
    > localhost:8080/graphiql
