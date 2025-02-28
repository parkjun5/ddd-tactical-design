package kitchenpos.apply.order.eatinorders.tobe.domain;

import kitchenpos.support.domain.ValueObject;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NumberOfGuest extends ValueObject {
    @Column(name = "number_of_guests", nullable = false)
    private int value;

    protected NumberOfGuest() { }

    public NumberOfGuest(int numberOfGuest) {
        if (numberOfGuest < 0) {
            throw new IllegalArgumentException("테이블 인원수는 0보다 작을 수 없다.");
        }

        this.value = numberOfGuest;
    }

    public int value() {
        return value;
    }

    public void clean() {
        this.value = 0;
    }
}
