package com.company.service.vo;
 
public class MemberVO {
 
	private String seq;
    private String userid;
    private String userpw;
    private String username;
    private String useremail;
 
    @Override
	public String toString() {
		return "MemberVO [seq=" + seq + ", id=" + userid + ", pw=" + userpw + ", name=" + username + ", email=" + useremail + "]";
	}

	public String getSeq() {
        return seq;
    }
    
    public String getUserid() {
        return userid;
    }
 
    public void setUserid(String userid) {
        this.userid = userid;
    }
 
    public String getUserpw() {
        return userpw;
    }
 
    public void setUserpw(String userpw) {
        this.userpw = userpw;
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getUseremail() {
        return useremail;
    }
 
    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }
 
}
 
