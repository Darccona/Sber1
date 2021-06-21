package lessons.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Map;

public class AutowiredClass {
    @Autowired //� ����� ������
    @Qualifier("main")
    //@Autowired(required = false) //����� �� ��������� ����������,
    //���� �� � ��� �������
    //������������� ������������ @Required
    private GreetingService greetingService;

    @Autowired //� ����� ������ � ���� ������� ��� ���������
    private GreetingService[] services;

    @Autowired //� Map, ��� ������� �������� ����� �����, �������� - ���� ����
    private Map<String, GreetingService> serviceMap;

    @Autowired //� ������������
    public AutowiredClass(@Qualifier("main") GreetingService service) {}

    @Autowired //� ������� ������� � ������������ ��������� ���������� � �� �����������
    public void prepare(GreetingService prepareContext){/* ���-�� ������... */}

    @Autowired //� "�������������" setter-������
    public void setContext(GreetingService service) { this.greetingService = service; }
}