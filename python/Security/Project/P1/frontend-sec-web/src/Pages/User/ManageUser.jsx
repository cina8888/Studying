export function ManageUser({users, setUsers}) {
    const handleDelete = (id) => {
        fetch(`https://127.0.0.1:8000/api/users/delete/${id}`, {
            method: 'DELETE',
        })
        .then(res => {
            if (res.ok) {
                setUsers(users.filter(user => user.id !== id));
                console.log("Xóa thành công!");
            } else {
                console.log("Có lỗi xảy ra khi xóa!");
            }
        })
        .catch(err => console.error("Lỗi:", err));
    }
    return(
        <div className="w-full max-w-4xl mx-auto mt-6">
            {/* Bảng hiển thị User */}
            <div className="overflow-x-auto bg-white rounded-lg shadow-md border border-slate-200">
                <table className="min-w-full text-left border-collapse">
                    <thead>
                        <tr className="bg-slate-100 text-slate-700 text-sm uppercase tracking-wider">
                            <th className="py-4 px-6 border-b font-semibold">ID</th>
                            <th className="py-4 px-6 border-b font-semibold">Username</th>
                            <th className="py-4 px-6 border-b font-semibold">Ngày tạo</th>
                            <th className="py-4 px-6 border-b font-semibold text-center">Hành động</th>
                        </tr>
                    </thead>
                    <tbody className="text-slate-600">
                        {users && users.length > 0 ? (
                            users.map((user) => (
                                <tr key={user.id} className="hover:bg-slate-50 border-b border-slate-100 transition-colors">
                                    <td className="py-3 px-6">{user.id}</td>
                                    <td className="py-3 px-6 font-medium text-slate-800">{user.username}</td>
                                    <td className="py-3 px-6">
                                        {user.created_at ? new Date(user.created_at).toLocaleDateString('vi-VN') : 'N/A'}
                                    </td>
                                    <td className="py-3 px-6 text-center">
                                        <button 
                                            className="bg-red-500 hover:bg-red-600 text-white font-medium px-4 py-1.5 rounded-md text-sm transition-colors shadow-sm"
                                            onClick={() => handleDelete(user.id)}
                                        >
                                            Delete
                                        </button>
                                    </td>
                                </tr>
                            ))
                        ) : (
                            <tr>
                                <td colSpan="4" className="py-6 text-center text-slate-400 italic">
                                    Chưa có user nào trong danh sách.
                                </td>
                            </tr>
                        )}
                    </tbody>
                </table>
            </div>

            {/* Nút Add User ở dưới bảng */}
            <div className="mt-6 flex justify-start">
                <button className="bg-emerald-500 hover:bg-emerald-600 text-white font-semibold px-6 py-2.5 rounded-lg shadow-md transition-colors flex items-center gap-2">
                    <svg xmlns="http://www.w3.org/2000/svg" className="h-5 w-5" viewBox="0 0 20 20" fill="currentColor">
                        <path fillRule="evenodd" d="M10 3a1 1 0 011 1v5h5a1 1 0 110 2h-5v5a1 1 0 11-2 0v-5H4a1 1 0 110-2h5V4a1 1 0 011-1z" clipRule="evenodd" />
                    </svg>
                    Add User
                </button>
            </div>
        </div>
    )
}