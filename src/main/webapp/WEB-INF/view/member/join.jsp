<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Join page</h1>
    <div class="container">
        <form>
            <h4>아이디</h4>
            <input type="text">
            <h4>비밀번호</h4>
            <input type="password">
            <h4>비밀번호 재확인</h4>
            <input type="password">
            <h4>이름</h4>
            <input type="text">
            <h4>생년월일</h4>
            <input type="date">
            <h4>성별</h4>
            <select>
                <option>남자</option>
                <option>여자</option>
            </select>
            <h4>본인 확인 이메일 <span>(선택)</span></h4>
            <input type="email">
            <h4>휴대전화</h4>
            <select>
                <option>대한민국 +82</option>
                <option>뉴질랜드 +22</option>
                <option>기니 +35</option>
                <option>영국 +45</option>
                <option>미국 +85</option>
                <option>중국 +55</option>
            </select>
            <div>
                <input type="number" placeholder="전화번호 입력"><input type="button" value="인증번호 받기">
            </div>
            <input type="number" placeholder="인증번호를 입력하세요.">
            <div>
                <a href="#">가입하기</a>
            </div>

        </form>
    </div>
</body>
</html>