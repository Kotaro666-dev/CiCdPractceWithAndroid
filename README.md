# CI/CD practice with Android

## 目的

Android プロジェクトに、CI/CD の手法を導入する練習をします。

## 目標

- Github Actions を使用して、テストを自動化して、継続的インテグレーションの土台を作ります
- Firebase App Distribution を使用して、検証アプ作成を自動化し、継続的デリバリを作ります。

## 継続的インテグレーション

### Github Actions

WIP...

### テスト手法

Android 開発には、テストに関して以下の 2 つのディレクトリが用意されています。

- app/src/androidTest
  - UI テスト
- app/src/test
  - Unit テスト

### Github Actions に UI テストを導入する

- 問題点: Github Actions が実行される環境にエミュレータを起動する必要がある
- 解決方法: [Malinskiy/action-android](https://github.com/Malinskiy/action-android)を使用する
- 参考
  - [uber/AutoDispose](https://github.com/uber/AutoDispose/blob/main/.github/workflows/ci.yml)
- 使用ツールのバージョン: 0.1.3
- 注意点
  - 互換性の関係で、JavaVersion を 11 に設定する
  - 使用エミュレータの API バージョンを 26 以下に設定する
  - minSdkVersion を 26 以下に設定する
  - テスト完了までに時間がかかる
    - 4m 39s
    
## 継続的デリバリ