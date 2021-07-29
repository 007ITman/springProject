  create table LOGIN_USER_INFO(
         UserId NUMBER NOT NULL,     --ユザーID
         UserName VARCHAR2(10) NOT NULL, --名前
         UserGender VARCHAR2(10)NOT NULL,  -- 性別
         UserAge NUMBER(2) NOT NULL,    -- 年齢     
         UserPassWord VARCHAR2(10) NOT NULL,       --パスワード
         UserRole VARCHAR2(10) NOT NULL, --ロール
         CreateTime Date NOT NULL,   --新規時間
         UpdateTime Date NOT NULL   --更新時間          
  ); 
  
  --创建主键约束--
  alter table LOGIN_USER_INFO add constraint PK_User_UserId primary key(UserId);
  --コメント--
  COMMENT ON TABLE LOGIN_USER_INFO IS 'ユーザ表';
  COMMENT ON COLUMN LOGIN_USER_INFO.UserId  IS 'ユザーID';
  COMMENT ON COLUMN LOGIN_USER_INFO.UserName  IS '名前';
  COMMENT ON COLUMN LOGIN_USER_INFO.UserGender  IS '性別';
  COMMENT ON COLUMN LOGIN_USER_INFO.UserAge  IS '年齢';
  COMMENT ON COLUMN LOGIN_USER_INFO.UserPassWord  IS 'パスワード';
  COMMENT ON COLUMN LOGIN_USER_INFO.UserRole  IS 'ロール';
  COMMENT ON COLUMN LOGIN_USER_INFO.CreateTime  IS '新規時間';
  COMMENT ON COLUMN LOGIN_USER_INFO.UpdateTime  IS '更新時間';
