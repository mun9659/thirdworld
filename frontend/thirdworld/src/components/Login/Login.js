import React, { useState, useEffect } from 'react';
import axios from 'axios';

function Login() {
    const [memId, setMemId] = useState('')
    const [password, setPassword] = useState('')
    const [data, setData] = useState('')

    const handleId = (e) => {
        setMemId(e.target.value)
    }

    const handlePassword = (e) => {
        setPassword(e.target.value)
    }

    const onClickLogin = () => {
        console.log('click login', memId, password)

        axios.post('http://localhost:8080/auth/login').then(response => (
            setData(response.data)
        ));
    }

    return (
        <div>
            <span class="loginTitle">ThirdWorld</span>
            <div><input type="text" class="loginInput" name="memId" onChange={handleId} placeholder="아이디" /></div>
            <div><input type="password" class="loginInput" name="password" onChange={handlePassword} placeholder="비밀번호" /></div>
            <input type="submit" class="loginSubmit loginButton" value="로그인" onClick={onClickLogin} />
            <input type="button" class="loginSubmit" value="가입"/>
        </div>
    )
}

export default Login;