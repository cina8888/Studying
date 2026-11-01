import { ManageUser } from "./ManageUser";

export function UserPage({users, setUsers}) {
    return(
        <>
            <div className="">
                <div>
                    <h1>User List</h1>
                </div>
                <div>
                    <ManageUser users={users} setUsers={setUsers}/>
                </div>
            </div>
        </>
    )
}