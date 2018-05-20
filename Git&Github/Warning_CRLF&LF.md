# Warning CRLF, LF

> warning: LF will be replaced by CRLF in package.json.
> The file will have its original line endings in your working directory.

----

이 오류는 Windows, Linux, Mac의 차이에서 발생하는 오류이다. Linux와 Mac은 개행을 할 때 LF(Line Feed)만 사용하지만 Windows에서는 CR(Carriage-Return)과 LF를 모두 사용한다. 이는 협업을 할 때 큰 오류를 불러올 수 있다. 그래서 Git에서는 충돌을 예방하기 위해 자동으로 CRLF를 LF로 바꿔준다.