package gilbarin.builder;

pulibc class Gillog {
    // 필수 인자
    private final String log;
    
    // 선택 인자
    private final String subject;
    private final String import;

    // 필수 생성자
    public Gillog(String log) {
        this(log, "공통주제", "공통참조");
    }
    
    // 1개 선택 인자 포함 생성자
    public Gillog(String log, String subject) {
    	this(log, subject, "공통참조");
    }
    
    // 모든 선택 인자까지 포함된 생성자
    public Gillog(String log, String subject, String import) {
        this.log = log;
        this.subject = subject;
        this.import = import;
    }
}
