# REST API
   REST API를 알아보기 전에 API가 무엇인지부터 확실하게 정하고 가자.
## API란?
   API(Application Programming Interface)는 응용 프로그램에서 사용할 수 있도록
   운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스이다.
   쉽게 말해, 프로그램들이 서로 소통하는 방법을 말한다.

## REST란?
   REST( Representational State Transfer )는
   분산 하이퍼미디어 시스템을 위한 아키텍쳐 스타일이다

## REST API 구성
##### 1. URI - 자원
##### 2. HTTP METHOD - 자원에 대한 행위

## HTTP METHOD 구성
#### POST, GET, PUT, DELETE가 있으며 CRUD를 진행할 수 있다.
##### GET - 리소스를 조회하고 그에 맞는 자세한 정보를 가져온다. - READ
##### POST - 리소스를 생성한다. - CREATE
##### PUT - 리소스를 수정한다. - UPDATE
##### DELETE - 리소스를 삭제한다. - DELETE

#### 만약 아래와 같은 URI가 있을 때
	GET http://test.com/blog/users
	GET http://test.com/blog/users:id
	POST http://test.com/blog/users
	PUT http://test.com/blog/users
	DELETE http://test.com/blog/users

## URI 규칙
##### 1. URI의 마지막에 /를 넣지 않는다.
##### 2. URI의 가독성을 위해 _보다는 -를 사용한다.
##### 3. 소문자를 사용한다.
##### 4. HTTP METHOD는 URI에 포함하지 않는다.
##### 5. URI는 동사보다는 명사를 사용한다.
##### 6. 컨트롤 자원을 의마하는 URI는 예외적으로 동사를 허용한다.

## REST API 제약조건
#### 1. Client-Server
<ul>
	<li> Client는 Server에 요청을 보내고 Server는 Client에 그에 맞는 응답을 보내는
	일대일 구조이다.
	<li> Client와 Server를 분리시켜서 Server, Client 각각의 의존도를 줄이고 각각의 기능에 충실		한다.
<ul>

#### 2. Cache
<ul>
	<li> 요청에 대한 응답은 독립적으로 처리가 가능하다. 이로 인해 Cache를 사용할 수 있다.
<ul>

#### 3. Stateless
<ul>
	<li> 클라이언트의 컨텍스트가 서버에 저장되지 않는다.
	<li> 서버는 요청에 대한 처리만 하면 되기 때문에 구현이 단순해 진다.
<ul>

#### 4. Layered System
<ul>
	<li> REST Server는 다중 계층으로 구성되어 있다.
	<li> 따라서 계층별로 하는 일이 구분되어 있어 유연성이 좋다.
<ul>

#### 5. Code-On-Demand (Option)
<ul>
	<li> 서버에서 클라이언트로 코드를 보내서 실행할 수 있어야 한다.
<ul>

#### 6. Uniform Interface
<ul>
	<li> 웹에 바람직한 구조적 특성을 부여하는 규칙으로 4가지 규칙이 있다.
<ul>

   #####    6-1 Identification of Resources
<ul>
	<li> 리소스가 URI를 식별해야 한다.
<ul>

   #####    6-2 Manipulation of Resources Through Representations
<ul>
	<li> 리소스를 생성, 삭제, 수정할 때 HTML 메세지에 그 내용을 담아야 한다.
<ul>

   #####    6-3 Self-Descriptive Messages
<ul>
	<li> 메세지는 스스로를 설명할 수 있어야 한다.
<ul>

   #####    6-4 Hypermedia as the Engine of Application State (HATEOAS)
<ul>
	<li> 애플리케이션의 상태는 Hyperlink를 이용해 전이되어야 한다.
<ul>