class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        for (int i=releaseTimes.length-1; i>0; i--)
            releaseTimes[i] = releaseTimes[i]-releaseTimes[i-1];
        char key = keysPressed.charAt(0);
        int duration = releaseTimes[0];
        for (int i=1; i<keysPressed.length(); i++) {
            if(releaseTimes[i] > duration) {
                key = keysPressed.charAt(i);
                duration = releaseTimes[i];
            }
            else if (releaseTimes[i]==duration && keysPressed.charAt(i)>key)
                    key = keysPressed.charAt(i);         
        }
        return key;
    }
}