# user.Management

# ユーザーについての情報を管理するAPI

## ユーザーについて

### ユーザー・ユーザー詳細・ユーザー情報の分類について

### User

- ユーザー検索はアカウント名とEmail情報を取得する

### UserDetail

- ユーザー詳細は名字・名前（読みがなも含む）・生年月日・携帯番号・パスワードを取得する

### UserPayment

- ユーザー支払い情報はクレジットカード番号・カードブランド・有効期限を取得する

### UserInfo(User+UserDetail+UserPayment)

- ユーザー情報は上記の内容をすべて取得する
