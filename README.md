# user.Management

# ユーザーについての情報を管理するAPI

## API設計とエンドポイントについて

| メソッド | エンドポイント     | 説明                  |
|------|:------------|:--------------------|
| GET  | /users      | 　ユーザー情報を全件取得する      |
| GET  | /users/{id} | 　指定したidでユーザー情報を取得する |

## クエリパラメータによる検索について

| キー      | 型      | 例                    | 説明                 |
|:--------|:-------|:---------------------|:-------------------|
| account | String | taro01               | ユーザーが登録したアカウント名で検索 |
| name    | String | yamada　              | ユーザーの名字・名前で検索      |
| kana    | String | ヤマダ　                 | ユーザーの読み仮名で検索       |
| email   | String | yamada11@test.ne.jp　 | ユーザーのEmailアドレスで検索  |

※Emailアドレスは完全一致のみの検索になります。

