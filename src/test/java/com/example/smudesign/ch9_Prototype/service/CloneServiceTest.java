package com.example.smudesign.ch9_Prototype.service;

import com.example.smudesign.ch9_Prototype.domain.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

class CloneServiceTest {

    private CloneService cloneService;

    @BeforeEach
    public void before(){
        cloneService = new CloneService(new ShapeRegistry());
    }

    @Test
    public void circleCloneTest(){
        //given
        Circle circle = new Circle();
        circle.setX(1);
        circle.setY(2);
        circle.setColor("RED");
        circle.setRadius(5);

        //when
        Circle clonedCircle = (Circle) cloneService.cloneShape(circle);

        //then
        Assertions.assertThat(circle).isEqualTo(clonedCircle);
    }

    @Test
    public void rectangleCloneTest(){
        //given
        Rectangle rectangle = new Rectangle();
        rectangle.setX(1);
        rectangle.setY(2);
        rectangle.setColor("BLUE");
        rectangle.setWidth(10);
        rectangle.setHeight(15);

        //when
        Rectangle clonedRectangle = (Rectangle) cloneService.cloneShape(rectangle);

        //then
        Assertions.assertThat(rectangle).isEqualTo(clonedRectangle);

    }

    @Test
    public void personCloneTest() throws CloneNotSupportedException {
        //given
        Person person = new Person();
        person.setAge(25);
        person.setName("홍길동");

        //when
        Person clonedPerson = cloneService.clonePerson(person);

        //then
        Assertions.assertThat(person).isEqualTo(clonedPerson);

    }

    @Test
    public void modelMapperTest(){
        //given
        ModelMapper mapper = new ModelMapper();
        Person person = new Person();
        person.setAge(25);
        person.setName("홍길동");

        //when
        Person cloned = mapper.map(person, Person.class);

        //then
        Assertions.assertThat(person).isEqualTo(cloned);
    }

    @Test
    public void registryTest(){
        //given
        Circle circle = new Circle();
        circle.setX(1);
        circle.setY(2);
        circle.setColor("RED");
        circle.setRadius(5);

        cloneService.addShapeRegistry("circle", circle);

        //when
        Circle returnedCircle = (Circle) cloneService.cloneByRegistry("circle");

        //then
        Assertions.assertThat(circle).isEqualTo(returnedCircle);

    }
}