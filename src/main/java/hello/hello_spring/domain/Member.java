package hello.hello_spring.domain;

public class Member {
    private Long id; // 여기서 id는 고객이 저장하는 값이 아니라 시스템 내에서 알아서 지정해주는 값이다.
    private String name;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName()  {
            return name;
    }
    public void setName(String name)  {
        this.name = name;
    }
}
