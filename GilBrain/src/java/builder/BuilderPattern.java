package gilbarin.builder;

public Class GillogCategory {
    private final String log;
    private final String subject;
    private final int viewFlag;
    private final int commentFlag;
    private final int maxQuestion;
    
    public static class Builder {
    	// 필수 인자
        private final String log;
        private final String subject;
        
        // 선택 인자 기본값 초기화
        private final int viewFlag = 0;
        private final int commnetFlag = 0;
        private final int maxQuestion = 0;
        
        public Builder(String log, String subject) {
            this.log = log;
            this.subject = subject;
        }
        
        public Builder viewFlag(int val) {
            viewFlag = val;
            // 이렇게 return해주어 .으로 Chaining이 가능하다.
            return this;
        }
        
        public Builder commentFlag(int val) {
            commentFlag = val;
            return this;
        }
        
        public Builder maxQuestion(int val) {
            maxQuestion = val;
            return this;
        }
        
        public GillogCategory build() {
            if(viewFlag > 1 || commentFlag > 1) {
            	throw new IllealArgumentException("Flag 값 오인 사용");
            }
            return new Gillog(this);
        }
    }
    
    private GillogCategory(Builder builder) {
        log = builder.log;
        subject = builder.subject;
        viewFlag = builder.viewFlag;
        commnetFlag = builder.commentFlag;
        maxQuestion = builder.maxQuestion;
    }
}
