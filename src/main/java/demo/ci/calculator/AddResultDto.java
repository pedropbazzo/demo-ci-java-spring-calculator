package demo.ci.calculator;

public class AddResultDto extends AddDto {

    private int result;

    AddResultDto(AddDto addDto, int result) {
        super.setA(addDto.getA());
        super.setB(addDto.getB());
        this.result = result;
    }

    public int getResult() {
        return this.result;
    }
}
