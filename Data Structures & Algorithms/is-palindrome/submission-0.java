class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        
        while (l < r) {
            // Nếu con trỏ bên trái không phải là chữ/số, bỏ qua và tiến tới
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            // Nếu con trỏ bên phải không phải là chữ/số, bỏ qua và lùi lại
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            
            // So sánh hai ký tự (chuyển về chữ thường để không phân biệt hoa thường)
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            
            l++;
            r--;
        }
        
        return true;
    }
}