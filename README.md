# 필름덤즈 프로젝트

영화인들을 위한 커뮤니티 사이트를 개발합니다.
</br></br>[기획서 링크](https://letspl.me/project/736)

## 프로젝트 참여 인원

* UI/UX 디자이너 1명
* 기획자 1명
* 프론트엔드 3명
* 백엔드 3명

## 프로젝트 진행 기간

2023.02.04 - (진행중)

## 백엔드 세부사항 (마지막 업데이트: 23.04.07.)
* [ERD](https://www.erdcloud.com/d/FwbkjZwxj7yPCBfxp)
* [API 명세](https://www.notion.so/Backend-API-1-f2a7140af5e9490ba92802b4b58acebf)

### 개발 환경
* 언어
  * Java (JDK 17)
* 서버
   * Apache 2.0
   * Apache Tomcat 10.1.5
   * NGINX 1.20 (프록시 서버)
* 프레임워크
  * Spring Framework 6.0.4
  * Spring Boot 3.0.2
  * Spring Data JPA 3.0.1
  * Spring Security 6.0.1
* 데이터베이스
  * MariaDB 10.5 (개발 및 운영 환경)
  * h2 database 2.1.214 (로컬 환경)
  
### 협업도구(Tool)

* Google Meet
* Slack
* Github

### 구현 완료 기능
* 로그인
  * 아이디, 비밀번호 기반 로그인
  * 소셜 계정 기반 로그인 
* 게시글, 배너 CRUD (리팩토링 진행 중)
* 게시판 조회
* 메인 페이지 조회
* 이미지 업로드
* 게시글 추천
* 댓글 조회

### 구현 예정 기능
* API 권한 설정
* 회원 프로필 조회/수정
* 태그(@) 이름으로 댓글 작성
* 알림
* 인기글 조회
* 회원가입
* 게시글, 댓글 신고
* 댓글 추천
* 이메일 인증
* 관리자 페이지
