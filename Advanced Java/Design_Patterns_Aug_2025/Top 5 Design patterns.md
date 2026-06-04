## Creational patterns 

1) Singleton - refer notes

2) Factory method

```
    public abstract class UIComponentCreator{

        public void show(String type)
        {
            UIComponent comp=createUIComponent(type);
            add(comp);
        }
        
        public abstract UIComponent createUIComponent(String type);
    }

    public class WindowsUIComponentCreator extends UIComponentCreator{

        public UIComponent createUIComponent(String type)
        {
            if(type.equals("button"))
            {
                return new WindowsButton();
            }
            else if(type.equals("textfield"))
            {
                return new WindowsTextField();
            }
            //else if.....

        }
    }

    public class MotifUIComponentCreator extends UIComponentCreator{

        public UIComponent createUIComponent(String type)
        {
            if(type.equals("button"))
            {
                return new MotifButton();
            }
            else if(type.equals("textfield"))
            {
                return new MotifTextField();
            }
            //else if.....
        }
    }

    public class GUIApplication{

        public static void main(String args[])
        {
            UIComponentCreator creator=new WindowsUIComponentCreator();
            creator.show("button");

            creator=new MotifUIComponentCreator();
            creator.show("button");
        }
    }

```

3) Builder pattern

```
    class User {

        private String name;
        private int age;
        private String email;
        private String phone;

        private User(UserBuilder builder) {
            this.name = builder.name;
            this.age = builder.age;
            this.email = builder.email;
            this.phone = builder.phone;
        }

        public static class UserBuilder {

            private String name;
            private int age;
            private String email;
            private String phone;

            public UserBuilder setName(String name) {
                this.name = name;
                return this;
            }

            public UserBuilder setAge(int age) {
                this.age = age;
                return this;
            }

            public UserBuilder setEmail(String email) {
                this.email = email;
                return this;
            }

            public UserBuilder setPhone(String phone) {
                this.phone = phone;
                return this;
            }

            public User build() {
                return new User(this);
            }
        }
    }

    public class Main {

        public static void main(String[] args) {

            User user = new User.UserBuilder()
                    .setName("Jishan")
                    .setAge(24)
                    .setEmail("jishan@gmail.com")
                    .setPhone("9876543210")
                    .build();

            System.out.println(user);
        }
    }

```
4) Observer

5) Strategy