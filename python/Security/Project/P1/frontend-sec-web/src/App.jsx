import './App.css'
import { Routes, Route } from 'react-router-dom'
import { useState, useEffect } from 'react';
import { UserPage } from './Pages/User/UserPage';

function App() {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    fetch('https://127.0.0.1:8000/api/users')
      .then(res => res.json())
      .then(data => setUsers(data))
      .catch(err => console.log("Error: ", err))
  }, [])

  return (
    <Routes>
      <Route index element={<UserPage users={users} setUsers={setUsers}/>}/>
    </Routes>
  )
}

export default App
