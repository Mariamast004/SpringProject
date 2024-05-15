package com.java.Project.Modal;

public class Student {

        private String studentName;
        private long studentId;
        private String studentGender;
        private Integer age;
        private String presentAddress;
        private String permanentAddress;
        private String emergencyContact;


        public Student() {
        }

        public Student(String studentName, long studentId,
                       String studentGender, Integer age,
                       String presentAddress, String permanentAddress,
                       String emergencyContact) {

            this.studentName = studentName;
            this.studentId = studentId;
            this.studentGender = studentGender;
            this.age = age;
            this.presentAddress = presentAddress;
            this.permanentAddress = permanentAddress;
            this.emergencyContact = emergencyContact;



        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public long getStudentId() {
            return studentId;
        }

        public void setStudentId(long studentId) {
            this.studentId = studentId;
        }

        public String getStudentGender() {
            return studentGender;
        }

        public void setStudentGender(String studentGender) {
            this.studentGender = studentGender;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getPresentAddress() {
            return presentAddress;
        }

        public void setPresentAddress(String presentAddress) {
            this.presentAddress = presentAddress;
        }

        public String getPermanentAddress() {
            return permanentAddress;
        }

        public void setPermanentAddress(String permanentAddress) {
            this.permanentAddress = permanentAddress;
        }

        public String getEmergencyContact() {
            return emergencyContact;
        }

        public void setEmergencyContact(String emergencyContact) {
            this.emergencyContact = emergencyContact;
        }


        @Override
        public String toString() {
            return "Student{" +  "studentName='" + studentName + '\'' + ", studentId=" + studentId + ", studentGender='" + studentGender + '\'' +
                    ", age=" + age +
                    ", presentAddress='" + presentAddress + '\'' +
                    ", permanentAddress='" + permanentAddress + '\'' +
                    ", emergencyContact='" + emergencyContact + '\'' +
                    '}';
        }
    }


