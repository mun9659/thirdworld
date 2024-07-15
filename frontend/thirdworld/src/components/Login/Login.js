import React, { useState, useEffect } from 'react';
import axios from 'axios';

function Login() {
    const [id, setId] = useState('')
    const [password, setPassword] = useState('')

    const handleId = (e) => {
        setId(e.target.value)
    }

    const handlePassword = (e) => {
        setPassword(e.target.value)
    }

    const onClickLogin = () => {
        console.log('click login')
    }

    return (
        <div>
            <span class="loginTitle">ThirdWorld</span>
            <div><input type="text" class="loginInput" name="id" onChange={handleId} placeholder="아이디" /></div>
            <div><input type="password" class="loginInput" name="password" onChange={handlePassword} placeholder="비밀번호" /></div>
            <input type="submit" class="loginSubmit loginButton" value="로그인" onClick={onClickLogin} />
            <input type="button" class="loginSubmit" value="가입"/>
        </div>
    )
}

export default Login;