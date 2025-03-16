// Creating a new class to create instances of the objects inherited from the Employee class.
class EmployeeData extends EmployeeModel {

	// Constructor for EmployeeData class.
	// Initializes the employee objects with their respective details.
	public EmployeeData() {
		Employee ceo = new Employee();
		ceo.setEmpNo("10001");
		ceo.setLastName("Garcia");
		ceo.setFirstName("Manuel III");
		ceo.setBirthday("10/11/1983");
		ceo.setAddress("Valero Carpark Building Valero Street 1227, Makati City");
		ceo.setPhoneNo("966-860-270");
		ceo.setSssNo("44-4506057-3");
		ceo.setPhilHealthNo("820126853951");
		ceo.setTinNo("1442-605-657-000");
		ceo.setPagibigNo("691295330870");
		ceo.setStatus("Regular");
		ceo.setPosition("Chief Executive Officer");
		ceo.setSupervisor("N/A");
		ceo.setBasicSalary(90000);
		ceo.setRiceSubsidy(1500);
		ceo.setPhoneAllowance(2000);
		ceo.setClothingAllowance(1000);
		ceo.setSemiMonthlyRate(45000);
		ceo.setHourlyRate(535.71);

		Employee coo = new Employee();
		coo.setEmpNo("10002");
		coo.setLastName("Lim");
		coo.setFirstName("Antonio");
		coo.setBirthday("06/19/1988");
		coo.setAddress("San Antonio De Padua 2, Block 1 Lot 8 and 2, Dasmarinas, Cavite");
		coo.setPhoneNo("171-867-411");
		coo.setSssNo("52-2061274-9");
		coo.setPhilHealthNo("331735646338");
		coo.setTinNo("683-102-776-000");
		coo.setPagibigNo("663904995411");
		coo.setStatus("Regular");
		coo.setPosition("Chief Operating Officer");
		coo.setSupervisor(ceo.getLastName() + " , " + ceo.getFirstName());
		coo.setBasicSalary(60000);
		coo.setRiceSubsidy(1500);
		coo.setPhoneAllowance(2000);
		coo.setClothingAllowance(1000);
		coo.setSemiMonthlyRate(30000);
		coo.setHourlyRate(357.14);

		Employee cfo = new Employee();
		cfo.setEmpNo("10003");
		cfo.setLastName("Aquino");
		cfo.setFirstName("Bianca Sofia");
		cfo.setBirthday("08/04/1989");
		cfo.setAddress("Rm. 402 4/F Jiao Building Timog Avenue Cor. Quezon Avenue 1100, Quezon City");
		cfo.setPhoneNo("966-889-370");
		cfo.setSssNo("30-8870406-2");
		cfo.setPhilHealthNo("177451189665");
		cfo.setTinNo("971-711-280-000");
		cfo.setPagibigNo("171519773969");
		cfo.setStatus("Regular");
		cfo.setPosition("Chief Finance Officer");
		cfo.setSupervisor(ceo.getLastName() + " , " + ceo.getFirstName());
		cfo.setBasicSalary(60000);
		cfo.setRiceSubsidy(1500);
		cfo.setPhoneAllowance(2000);
		cfo.setClothingAllowance(1000);
		cfo.setSemiMonthlyRate(30000);
		cfo.setHourlyRate(357.14);

		Employee cmo = new Employee();
		cmo.setEmpNo("10004");
		cmo.setLastName("Reyes");
		cmo.setFirstName("Isabella");
		cmo.setBirthday("06/16/1994");
		cmo.setAddress("460 Solanda Street Intramuros 1000, Manila");
		cmo.setPhoneNo("786-868-477");
		cmo.setSssNo("40-2511815-0");
		cmo.setPhilHealthNo("341911411254");
		cmo.setTinNo("876-809-437-000");
		cmo.setPagibigNo("416946776041");
		cmo.setStatus("Regular");
		cmo.setPosition("Chief Marketing Officer");
		cmo.setSupervisor(ceo.getLastName() + " , " + ceo.getFirstName());
		cmo.setBasicSalary(60000);
		cmo.setRiceSubsidy(1500);
		cmo.setPhoneAllowance(2000);
		cmo.setClothingAllowance(1000);
		cmo.setSemiMonthlyRate(30000);
		cmo.setHourlyRate(357.14);

		Employee itops = new Employee();
		itops.setEmpNo("10005");
		itops.setLastName("Hernandez");
		itops.setFirstName("Eduard");
		itops.setBirthday("09/23/1989");
		itops.setAddress("National Highway, Gingoog,  Misamis Occidental");
		itops.setPhoneNo("088-861-012");
		itops.setSssNo("50-5577638-1");
		itops.setPhilHealthNo("957436191812");
		itops.setTinNo("031-702-374-000");
		itops.setPagibigNo("952347222457");
		itops.setStatus("Regular");
		itops.setPosition("IT Operations and Systems");
		itops.setSupervisor(coo.getLastName() + " , " + coo.getFirstName());
		itops.setBasicSalary(52670);
		itops.setRiceSubsidy(1500);
		itops.setPhoneAllowance(1000);
		itops.setClothingAllowance(1000);
		itops.setSemiMonthlyRate(30000);
		itops.setHourlyRate(313.51);

		Employee hrMgr = new Employee();
		hrMgr.setEmpNo("10006");
		hrMgr.setLastName("Villanueva");
		hrMgr.setFirstName("Andrea Mae");
		hrMgr.setBirthday("02/14/1988");
		hrMgr.setAddress("17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands ");
		hrMgr.setPhoneNo("918-621-603");
		hrMgr.setSssNo("49-1632020-8");
		hrMgr.setPhilHealthNo("382189453145");
		hrMgr.setTinNo("317-674-022-000");
		hrMgr.setPagibigNo("441093369646");
		hrMgr.setStatus("Regular");
		hrMgr.setPosition("HR Managerr");
		hrMgr.setSupervisor(coo.getLastName() + " , " + coo.getFirstName());
		hrMgr.setBasicSalary(52670);
		hrMgr.setRiceSubsidy(1500);
		hrMgr.setPhoneAllowance(1000);
		hrMgr.setClothingAllowance(1000);
		hrMgr.setSemiMonthlyRate(26335);
		hrMgr.setHourlyRate(313.51);

		Employee hrTM = new Employee();
		hrTM.setEmpNo("10007");
		hrTM.setLastName("San Jose");
		hrTM.setFirstName("Brad");
		hrTM.setBirthday("03/15/1996");
		hrTM.setAddress("99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi");
		hrTM.setPhoneNo("797-009-261");
		hrTM.setSssNo("40-2400714-1");
		hrTM.setPhilHealthNo("239192926939");
		hrTM.setTinNo("672-474-690-000");
		hrTM.setPagibigNo("210850209964");
		hrTM.setStatus("Regular");
		hrTM.setPosition("HR Team Leader");
		hrTM.setSupervisor(hrMgr.getLastName() + " , " + hrMgr.getFirstName());
		hrTM.setBasicSalary(42975);
		hrTM.setRiceSubsidy(1500);
		hrTM.setPhoneAllowance(800);
		hrTM.setClothingAllowance(800);
		hrTM.setSemiMonthlyRate(21488);
		hrTM.setHourlyRate(255.80);

		Employee hrRF1 = new Employee();
		hrRF1.setEmpNo("10008");
		hrRF1.setLastName("Romualdez");
		hrRF1.setFirstName("Alice");
		hrRF1.setBirthday("05/14/1992");
		hrRF1.setAddress("12A/33 Upton Isle Apt. 420, Roxas City 1814 Surigao del Norte ");
		hrRF1.setPhoneNo("983-606-799");
		hrRF1.setSssNo("55-4476527-2");
		hrRF1.setPhilHealthNo("545652640232");
		hrRF1.setTinNo("888-572-294-000");
		hrRF1.setPagibigNo("211385556888");
		hrRF1.setStatus("Regular");
		hrRF1.setPosition("HR Rank and File");
		hrRF1.setSupervisor(hrTM.getLastName() + " , " + hrTM.getFirstName());
		hrRF1.setBasicSalary(22500);
		hrRF1.setRiceSubsidy(1500);
		hrRF1.setPhoneAllowance(500);
		hrRF1.setClothingAllowance(500);
		hrRF1.setSemiMonthlyRate(11250);
		hrRF1.setHourlyRate(133.93);

		Employee hrRF2 = new Employee();
		hrRF2.setEmpNo("10009");
		hrRF2.setLastName("Atienza");
		hrRF2.setFirstName("Rosie ");
		hrRF2.setBirthday("09/24/1948");
		hrRF2.setAddress("90A Dibbert Terrace Apt. 190, San Lorenzo 6056 Davao del Norte");
		hrRF2.setPhoneNo("266-036-427");
		hrRF2.setSssNo("41-0644692-3");
		hrRF2.setPhilHealthNo("708988234853");
		hrRF2.setTinNo("604-997-793-000");
		hrRF2.setPagibigNo("260107732354");
		hrRF2.setStatus("Regular");
		hrRF2.setPosition("HR Rank and File");
		hrRF2.setSupervisor(hrTM.getLastName() + " , " + hrTM.getFirstName());
		hrRF2.setBasicSalary(22500);
		hrRF2.setRiceSubsidy(1500);
		hrRF2.setPhoneAllowance(500);
		hrRF2.setClothingAllowance(500);
		hrRF2.setSemiMonthlyRate(11250);
		hrRF2.setHourlyRate(133.93);

		Employee acctgHead = new Employee();
		acctgHead.setEmpNo("10010");
		acctgHead.setLastName("Alvaro");
		acctgHead.setFirstName("Roderick ");
		acctgHead.setBirthday("03/30/1988");
		acctgHead.setAddress("#284 T. Morato corner, Scout Rallos Street, Quezon City");
		acctgHead.setPhoneNo("053-381-386");
		acctgHead.setSssNo("64-7605054-4");
		acctgHead.setPhilHealthNo("578114853194");
		acctgHead.setTinNo("525-420-419-000");
		acctgHead.setPagibigNo("799254095212");
		acctgHead.setStatus("Regular");
		acctgHead.setPosition("Accounting Head");
		acctgHead.setSupervisor(cfo.getLastName() + " , " + cfo.getFirstName());
		acctgHead.setBasicSalary(52670);
		acctgHead.setRiceSubsidy(1500);
		acctgHead.setPhoneAllowance(1000);
		acctgHead.setClothingAllowance(1000);
		acctgHead.setSemiMonthlyRate(26335);
		acctgHead.setHourlyRate(313.51);

		Employee payrollMgr = new Employee();
		payrollMgr.setEmpNo("10011");
		payrollMgr.setLastName("Salcedo");
		payrollMgr.setFirstName("Anthony ");
		payrollMgr.setBirthday("09/14/1993");
		payrollMgr.setAddress("93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate");
		payrollMgr.setPhoneNo("070-766-300");
		payrollMgr.setSssNo("26-9647608-3");
		payrollMgr.setPhilHealthNo("126445315651");
		payrollMgr.setTinNo("210-805-911-000");
		payrollMgr.setPagibigNo("218002473454");
		payrollMgr.setStatus("Regular");
		payrollMgr.setPosition("Payroll Manager");
		payrollMgr.setSupervisor(acctgHead.getLastName() + " , " + acctgHead.getFirstName());
		payrollMgr.setBasicSalary(50825);
		payrollMgr.setRiceSubsidy(1500);
		payrollMgr.setPhoneAllowance(1000);
		payrollMgr.setClothingAllowance(1000);
		payrollMgr.setSemiMonthlyRate(25413);
		payrollMgr.setHourlyRate(302.53);

		Employee payrollTL = new Employee();
		payrollTL.setEmpNo("10012");
		payrollTL.setLastName("Lopez");
		payrollTL.setFirstName("Josie");
		payrollTL.setBirthday("01/14/1987");
		payrollTL.setAddress("49 Springs Apt. 266, Poblacion, Taguig 3200 Occidental Mindoro");
		payrollTL.setPhoneNo("478-355-427");
		payrollTL.setSssNo("44-8563448-3");
		payrollTL.setPhilHealthNo("431709011012");
		payrollTL.setTinNo("218-489-737-000");
		payrollTL.setPagibigNo("113071293354");
		payrollTL.setStatus("Regular");
		payrollTL.setPosition("Payroll Team Leader");
		payrollTL.setSupervisor(payrollMgr.getLastName() + " , " + payrollMgr.getFirstName());
		payrollTL.setBasicSalary(38475);
		payrollTL.setRiceSubsidy(1500);
		payrollTL.setPhoneAllowance(800);
		payrollTL.setClothingAllowance(800);
		payrollTL.setSemiMonthlyRate(19238);
		payrollTL.setHourlyRate(229.02);

		Employee payrollRF1 = new Employee();
		payrollRF1.setEmpNo("10013");
		payrollRF1.setLastName("Farala");
		payrollRF1.setFirstName("Martha");
		payrollRF1.setBirthday("01/11/1942");
		payrollRF1.setAddress("42/25 Sawayn Stream, Ubay 1208 Zamboanga del Norte ");
		payrollRF1.setPhoneNo("329-034-366");
		payrollRF1.setSssNo("45-5656375-0");
		payrollRF1.setPhilHealthNo("233693897247");
		payrollRF1.setTinNo("210-835-851-000");
		payrollRF1.setPagibigNo("631130283546");
		payrollRF1.setStatus("Regular");
		payrollRF1.setPosition("Payroll Rank and File");
		payrollRF1.setSupervisor(payrollMgr.getLastName() + " , " + payrollMgr.getFirstName());
		payrollRF1.setBasicSalary(24000);
		payrollRF1.setRiceSubsidy(1500);
		payrollRF1.setPhoneAllowance(500);
		payrollRF1.setClothingAllowance(500);
		payrollRF1.setSemiMonthlyRate(12000);
		payrollRF1.setHourlyRate(142.86);

		Employee payrollRF2 = new Employee();
		payrollRF2.setEmpNo("10014");
		payrollRF2.setLastName("Martinez");
		payrollRF2.setFirstName("Leila");
		payrollRF2.setBirthday("07/11/1970");
		payrollRF2.setAddress("37/46 Kulas Roads, Maragondon 0962 Quirino ");
		payrollRF2.setPhoneNo("877-110-749");
		payrollRF2.setSssNo("27-2090996-4");
		payrollRF2.setPhilHealthNo("515741057496");
		payrollRF2.setTinNo("275-792-513-000");
		payrollRF2.setPagibigNo("101205445886");
		payrollRF2.setStatus("Regular");
		payrollRF2.setPosition("Payroll Rank and File");
		payrollRF2.setSupervisor(payrollMgr.getLastName() + " , " + payrollMgr.getFirstName());
		payrollRF2.setBasicSalary(24000);
		payrollRF2.setRiceSubsidy(1500);
		payrollRF2.setPhoneAllowance(500);
		payrollRF2.setClothingAllowance(500);
		payrollRF2.setSemiMonthlyRate(12000);
		payrollRF2.setHourlyRate(142.86);

		Employee acctMgr = new Employee();
		acctMgr.setEmpNo("10015");
		acctMgr.setLastName("Romualdez");
		acctMgr.setFirstName("Fredrick ");
		acctMgr.setBirthday("03/10/1985");
		acctMgr.setAddress("22A/52 Lubowitz Meadows, Pililla 4895 Zambales");
		acctMgr.setPhoneNo("023-079-009");
		acctMgr.setSssNo("26-8768374-1");
		acctMgr.setPhilHealthNo("308366860059");
		acctMgr.setTinNo("598-065-761-000");
		acctMgr.setPagibigNo("223057707853");
		acctMgr.setStatus("Regular");
		acctMgr.setPosition("Account Manager");
		acctMgr.setSupervisor(coo.getLastName() + " , " + coo.getFirstName());
		acctMgr.setBasicSalary(53500);
		acctMgr.setRiceSubsidy(1500);
		acctMgr.setPhoneAllowance(1000);
		acctMgr.setClothingAllowance(1000);
		acctMgr.setSemiMonthlyRate(26750);
		acctMgr.setHourlyRate(318.45);

		Employee acctTL1 = new Employee();
		acctTL1.setEmpNo("10016");
		acctTL1.setLastName("Mata");
		acctTL1.setFirstName("Christian ");
		acctTL1.setBirthday("10/21/1987");
		acctTL1.setAddress("90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu ");
		acctTL1.setPhoneNo("783-776-744");
		acctTL1.setSssNo("49-2959312-6");
		acctTL1.setPhilHealthNo("824187961962");
		acctTL1.setTinNo("103-100-522-000");
		acctTL1.setPagibigNo("631052853464");
		acctTL1.setStatus("Regular");
		acctTL1.setPosition("Account Team Leader");
		acctTL1.setSupervisor(acctMgr.getLastName() + " , " + acctMgr.getFirstName());
		acctTL1.setBasicSalary(42975);
		acctTL1.setRiceSubsidy(1500);
		acctTL1.setPhoneAllowance(800);
		acctTL1.setClothingAllowance(800);
		acctTL1.setSemiMonthlyRate(21488);
		acctTL1.setHourlyRate(255.80);

		Employee acctTL2 = new Employee();
		acctTL2.setEmpNo("10017");
		acctTL2.setLastName("De Leon");
		acctTL2.setFirstName("Selena  ");
		acctTL2.setBirthday("02/20/1975");
		acctTL2.setAddress("89A Armstrong Trace, Compostela 7874 Maguindanao");
		acctTL2.setPhoneNo("975-432-139");
		acctTL2.setSssNo("27-2090208-8");
		acctTL2.setPhilHealthNo("587272469938");
		acctTL2.setTinNo("482-259-498-000");
		acctTL2.setPagibigNo("719007608464");
		acctTL2.setStatus("Regular");
		acctTL2.setPosition("Account Team Leader");
		acctTL2.setSupervisor(acctMgr.getLastName() + " , " + acctMgr.getFirstName());
		acctTL2.setBasicSalary(41850);
		acctTL2.setRiceSubsidy(1500);
		acctTL2.setPhoneAllowance(800);
		acctTL2.setClothingAllowance(800);
		acctTL2.setSemiMonthlyRate(20925);
		acctTL2.setHourlyRate(249.11);

		Employee acctRF1 = new Employee();
		acctRF1.setEmpNo("10018");
		acctRF1.setLastName("San Jose");
		acctRF1.setFirstName("Allison ");
		acctRF1.setBirthday("06/24/1986");
		acctRF1.setAddress("08 Grant Drive Suite 406, Poblacion, Iloilo City 9186 La Union");
		acctRF1.setPhoneNo("179-075-129");
		acctRF1.setSssNo("45-3251383-0");
		acctRF1.setPhilHealthNo("745148459521");
		acctRF1.setTinNo("121-203-336-000");
		acctRF1.setPagibigNo("114901859343");
		acctRF1.setStatus("Regular");
		acctRF1.setPosition("Account Rank and File");
		acctRF1.setSupervisor(acctTL1.getLastName() + " , " + acctTL1.getFirstName());
		acctRF1.setBasicSalary(22500);
		acctRF1.setRiceSubsidy(1500);
		acctRF1.setPhoneAllowance(500);
		acctRF1.setClothingAllowance(500);
		acctRF1.setSemiMonthlyRate(11250);
		acctRF1.setHourlyRate(133.93);

		Employee acctRF2 = new Employee();
		acctRF2.setEmpNo("10019");
		acctRF2.setLastName("Rosario");
		acctRF2.setFirstName("Cydney  ");
		acctRF2.setBirthday("10/06/1996");
		acctRF2.setAddress("93A/21 Berge Points, Tapaz 2180 Quezon");
		acctRF2.setPhoneNo("868-819-912");
		acctRF2.setSssNo("49-1629900-2");
		acctRF2.setPhilHealthNo("579253435499");
		acctRF2.setTinNo("122-244-511-000");
		acctRF2.setPagibigNo("265104358643");
		acctRF2.setStatus("Regular");
		acctRF2.setPosition("Account Rank and File");
		acctRF2.setSupervisor(acctTL1.getLastName() + " , " + acctTL1.getFirstName());
		acctRF2.setBasicSalary(22500);
		acctRF2.setRiceSubsidy(1500);
		acctRF2.setPhoneAllowance(500);
		acctRF2.setClothingAllowance(500);
		acctRF2.setSemiMonthlyRate(11250);
		acctRF2.setHourlyRate(133.93);

		Employee acctRF3 = new Employee();
		acctRF3.setEmpNo("10020");
		acctRF3.setLastName("Bautista");
		acctRF3.setFirstName("Mark");
		acctRF3.setBirthday("02/12/1991");
		acctRF3.setAddress("65 Murphy Center Suite 094, Poblacion, Palayan 5636 Quirino");
		acctRF3.setPhoneNo("683-725-348");
		acctRF3.setSssNo("49-1647342-5");
		acctRF3.setPhilHealthNo("399665157135");
		acctRF3.setTinNo("273-970-941-000");
		acctRF3.setPagibigNo("260054585575");
		acctRF3.setStatus("Regular");
		acctRF3.setPosition("Account Rank and File");
		acctRF3.setSupervisor(acctTL1.getLastName() + " , " + acctTL1.getFirstName());
		acctRF3.setBasicSalary(23250);
		acctRF3.setRiceSubsidy(1500);
		acctRF3.setPhoneAllowance(500);
		acctRF3.setClothingAllowance(500);
		acctRF3.setSemiMonthlyRate(11625);
		acctRF3.setHourlyRate(138.39);

		Employee acctRF4 = new Employee();
		acctRF4.setEmpNo("10021");
		acctRF4.setLastName("Lazaro");
		acctRF4.setFirstName("Darlene");
		acctRF4.setBirthday("11/25/1985");
		acctRF4.setAddress("47A/94 Larkin Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino");
		acctRF4.setPhoneNo("740-721-558");
		acctRF4.setSssNo("45-5617168-2");
		acctRF4.setPhilHealthNo("606386917510");
		acctRF4.setTinNo("354-650-951-000");
		acctRF4.setPagibigNo("104907708845");
		acctRF4.setStatus("Probationary");
		acctRF4.setPosition("Account Rank and File");
		acctRF4.setSupervisor(acctTL1.getLastName() + " , " + acctTL1.getFirstName());
		acctRF4.setBasicSalary(23250);
		acctRF4.setRiceSubsidy(1500);
		acctRF4.setPhoneAllowance(500);
		acctRF4.setClothingAllowance(500);
		acctRF4.setSemiMonthlyRate(11625);
		acctRF4.setHourlyRate(138.39);

		Employee acctRF5 = new Employee();
		acctRF5.setEmpNo("10021");
		acctRF5.setLastName("Lazaro");
		acctRF5.setFirstName("Darlene");
		acctRF5.setBirthday("11/25/1985");
		acctRF5.setAddress("47A/94 Larkin Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino");
		acctRF5.setPhoneNo("740-721-558");
		acctRF5.setSssNo("45-5617168-2");
		acctRF5.setPhilHealthNo("606386917510");
		acctRF5.setTinNo("354-650-951-000");
		acctRF5.setPagibigNo("104907708845");
		acctRF5.setStatus("Probationary");
		acctRF5.setPosition("Account Rank and File");
		acctRF5.setSupervisor(acctTL1.getLastName() + " , " + acctTL1.getFirstName());
		acctRF5.setBasicSalary(23250);
		acctRF5.setRiceSubsidy(1500);
		acctRF5.setPhoneAllowance(500);
		acctRF5.setClothingAllowance(500);
		acctRF5.setSemiMonthlyRate(11625);
		acctRF5.setHourlyRate(138.39);

		Employee acctRF6 = new Employee();
		acctRF6.setEmpNo("10022");
		acctRF6.setLastName("Delos Santos");
		acctRF6.setFirstName("Kolby");
		acctRF6.setBirthday("02/26/1980");
		acctRF6.setAddress("06A Gulgowski Extensions, Bongabon 6085 Zamboanga del Sur");
		acctRF6.setPhoneNo("739-443-033");
		acctRF6.setSssNo("52-0109570-6");
		acctRF6.setPhilHealthNo("357451271274");
		acctRF6.setTinNo("187-500-345-000");
		acctRF6.setPagibigNo("113017988667");
		acctRF6.setStatus("Probationary");
		acctRF6.setPosition("Account Rank and File");
		acctRF6.setSupervisor(acctTL1.getLastName() + " , " + acctTL1.getFirstName());
		acctRF6.setBasicSalary(24000);
		acctRF6.setRiceSubsidy(1500);
		acctRF6.setPhoneAllowance(500);
		acctRF6.setClothingAllowance(500);
		acctRF6.setSemiMonthlyRate(12000);
		acctRF6.setHourlyRate(142.86);

		Employee acctRF7 = new Employee();
		acctRF7.setEmpNo("10023");
		acctRF7.setLastName("Santos");
		acctRF7.setFirstName("Vella");
		acctRF7.setBirthday("12/31/1983");
		acctRF7.setAddress("99A Padberg Spring, Poblacion, Mabalacat 3959 Lanao del Sur");
		acctRF7.setPhoneNo("955-879-269");
		acctRF7.setSssNo("52-9883524-3");
		acctRF7.setPhilHealthNo("548670482885");
		acctRF7.setTinNo("101-558-994-000");
		acctRF7.setPagibigNo("360028104576");
		acctRF7.setStatus("Probationary");
		acctRF7.setPosition("Account Rank and File");
		acctRF7.setSupervisor(acctTL1.getLastName() + " , " + acctTL1.getFirstName());
		acctRF7.setBasicSalary(22500);
		acctRF7.setRiceSubsidy(1500);
		acctRF7.setPhoneAllowance(500);
		acctRF7.setClothingAllowance(500);
		acctRF7.setSemiMonthlyRate(11250);
		acctRF7.setHourlyRate(133.93);

		Employee acctRF8 = new Employee();
		acctRF8.setEmpNo("10024");
		acctRF8.setLastName("Del Rosario");
		acctRF8.setFirstName("Tomas");
		acctRF8.setBirthday("12/18/1978");
		acctRF8.setAddress("80A/48 Ledner Ridges, Poblacion, Kabankalan 8870 Marinduque");
		acctRF8.setPhoneNo("882-550-989");
		acctRF8.setSssNo("45-5866331-6");
		acctRF8.setPhilHealthNo("953901539995");
		acctRF8.setTinNo("560-735-732-000");
		acctRF8.setPagibigNo("913108649964");
		acctRF8.setStatus("Probationary");
		acctRF8.setPosition("Account Rank and File");
		acctRF8.setSupervisor(acctTL1.getLastName() + " , " + acctTL1.getFirstName());
		acctRF8.setBasicSalary(22500);
		acctRF8.setRiceSubsidy(1500);
		acctRF8.setPhoneAllowance(500);
		acctRF8.setClothingAllowance(500);
		acctRF8.setSemiMonthlyRate(11250);
		acctRF8.setHourlyRate(133.93);

		Employee acctRF9 = new Employee();
		acctRF9.setEmpNo("10025");
		acctRF9.setLastName("Tolentino");
		acctRF9.setFirstName("Jacklyn");
		acctRF9.setBirthday("05/19/1984");
		acctRF9.setAddress("96/48 Watsica Flats Suite 734, Poblacion, Malolos 1844 Ifugao");
		acctRF9.setPhoneNo("675-757-366");
		acctRF9.setSssNo("47-1692793-0");
		acctRF9.setPhilHealthNo("753800654114");
		acctRF9.setTinNo("841-177-857-000");
		acctRF9.setPagibigNo("210546661243");
		acctRF9.setStatus("Probationary");
		acctRF9.setPosition("Account Rank and File");
		acctRF9.setSupervisor(acctTL2.getLastName() + " , " + acctTL2.getFirstName());
		acctRF9.setBasicSalary(24000);
		acctRF9.setRiceSubsidy(1500);
		acctRF9.setPhoneAllowance(500);
		acctRF9.setClothingAllowance(500);
		acctRF9.setSemiMonthlyRate(12000);
		acctRF9.setHourlyRate(142.86);

		Employee acctRF10 = new Employee();
		acctRF10.setEmpNo("10026");
		acctRF10.setLastName("Gutierrez");
		acctRF10.setFirstName("Percival");
		acctRF10.setBirthday("12/18/1970");
		acctRF10.setAddress("58A Wilderman Walks, Poblacion, Digos 5822 Davao del Sur");
		acctRF10.setPhoneNo("512-899-876");
		acctRF10.setSssNo("40-9504657-8");
		acctRF10.setPhilHealthNo("797639382265");
		acctRF10.setTinNo("502-995-671-000");
		acctRF10.setPagibigNo("210897095686");
		acctRF10.setStatus("Probationary");
		acctRF10.setPosition("Account Rank and File");
		acctRF10.setSupervisor(acctTL2.getLastName() + " , " + acctTL2.getFirstName());
		acctRF10.setBasicSalary(24750);
		acctRF10.setRiceSubsidy(1500);
		acctRF10.setPhoneAllowance(500);
		acctRF10.setClothingAllowance(500);
		acctRF10.setSemiMonthlyRate(12375);
		acctRF10.setHourlyRate(147.32);

		Employee acctRF11 = new Employee();
		acctRF11.setEmpNo("10027");
		acctRF11.setLastName("Manalaysay");
		acctRF11.setFirstName("Garfield");
		acctRF11.setBirthday("08/28/1986");
		acctRF11.setAddress("60 Goyette Valley Suite 219, Poblacion, Tabuk 3159 Lanao del Sur");
		acctRF11.setPhoneNo("948-628-136");
		acctRF11.setSssNo("45-3298166-4");
		acctRF11.setPhilHealthNo("810909286264");
		acctRF11.setTinNo("336-676-445-000");
		acctRF11.setPagibigNo("211274476563");
		acctRF11.setStatus("Probationary");
		acctRF11.setPosition("Account Rank and File");
		acctRF11.setSupervisor(acctTL2.getLastName() + " , " + acctTL2.getFirstName());
		acctRF11.setBasicSalary(24750);
		acctRF11.setRiceSubsidy(1500);
		acctRF11.setPhoneAllowance(500);
		acctRF11.setClothingAllowance(500);
		acctRF11.setSemiMonthlyRate(12375);
		acctRF11.setHourlyRate(147.32);

		Employee acctRF12 = new Employee();
		acctRF12.setEmpNo("10028");
		acctRF12.setLastName("Villegas");
		acctRF12.setFirstName("Lizeth ");
		acctRF12.setBirthday("12/12/1981");
		acctRF12.setAddress("66/77 Mann Views, Luisiana 1263 Dinagat Islands");
		acctRF12.setPhoneNo("332-372-215");
		acctRF12.setSssNo("40-2400719-4");
		acctRF12.setPhilHealthNo("934389652994");
		acctRF12.setTinNo("210-395-397-000");
		acctRF12.setPagibigNo("122238077997");
		acctRF12.setStatus("Probationary");
		acctRF12.setPosition("Account Rank and File");
		acctRF12.setSupervisor(acctTL2.getLastName() + " , " + acctTL2.getFirstName());
		acctRF12.setBasicSalary(24000);
		acctRF12.setRiceSubsidy(1500);
		acctRF12.setPhoneAllowance(500);
		acctRF12.setClothingAllowance(500);
		acctRF12.setSemiMonthlyRate(12000);
		acctRF12.setHourlyRate(142.86);

		Employee acctRF13 = new Employee();
		acctRF13.setEmpNo("10029");
		acctRF13.setLastName("Ramos");
		acctRF13.setFirstName("Carol");
		acctRF13.setBirthday("08/20/1978");
		acctRF13.setAddress("72/70 Stamm Spurs, Bustos 4550 Iloilo");
		acctRF13.setPhoneNo("250-700-389");
		acctRF13.setSssNo("60-1152206-4");
		acctRF13.setPhilHealthNo("351830469744");
		acctRF13.setTinNo("395-032-717-000");
		acctRF13.setPagibigNo("212141893454");
		acctRF13.setStatus("Probationary");
		acctRF13.setPosition("Account Rank and File");
		acctRF13.setSupervisor(acctTL2.getLastName() + " , " + acctTL2.getFirstName());
		acctRF13.setBasicSalary(22500);
		acctRF13.setRiceSubsidy(1500);
		acctRF13.setPhoneAllowance(500);
		acctRF13.setClothingAllowance(500);
		acctRF13.setSemiMonthlyRate(11250);
		acctRF13.setHourlyRate(133.93);

		Employee acctRF14 = new Employee();
		acctRF14.setEmpNo("10030");
		acctRF14.setLastName("Maceda");
		acctRF14.setFirstName("Emelia");
		acctRF14.setBirthday("04/14/1973");
		acctRF14.setAddress("50A/83 Bahringer Oval Suite 145, Kiamba 7688 Nueva Ecija");
		acctRF14.setPhoneNo("973-358-041");
		acctRF14.setSssNo("54-1331005-0");
		acctRF14.setPhilHealthNo("465087894112");
		acctRF14.setTinNo("3215-973-013-000");
		acctRF14.setPagibigNo("515012579765");
		acctRF14.setStatus("Probationary");
		acctRF14.setPosition("Account Rank and File");
		acctRF14.setSupervisor(acctTL2.getLastName() + " , " + acctTL2.getFirstName());
		acctRF14.setBasicSalary(22500);
		acctRF14.setRiceSubsidy(1500);
		acctRF14.setPhoneAllowance(500);
		acctRF14.setClothingAllowance(500);
		acctRF14.setSemiMonthlyRate(11250);
		acctRF14.setHourlyRate(133.93);

		Employee acctRF15 = new Employee();
		acctRF15.setEmpNo("10031");
		acctRF15.setLastName("Aguilar");
		acctRF15.setFirstName("Delia ");
		acctRF15.setBirthday("01/27/1989");
		acctRF15.setAddress("95 Cremin Junction, Surallah 2809 Cotabato");
		acctRF15.setPhoneNo("529-705-439");
		acctRF15.setSssNo("52-1859253-1");
		acctRF15.setPhilHealthNo("136451303068");
		acctRF15.setTinNo("599-312-588-000");
		acctRF15.setPagibigNo("110018813465");
		acctRF15.setStatus("Probationary");
		acctRF15.setPosition("Account Rank and File");
		acctRF15.setSupervisor(acctTL2.getLastName() + " , " + acctTL2.getFirstName());
		acctRF15.setBasicSalary(22500);
		acctRF15.setRiceSubsidy(1500);
		acctRF15.setPhoneAllowance(500);
		acctRF15.setClothingAllowance(500);
		acctRF15.setSemiMonthlyRate(11250);
		acctRF15.setHourlyRate(133.93);

		Employee sm = new Employee();
		sm.setEmpNo("10032");
		sm.setLastName("Castro");
		sm.setFirstName("John Rafael");
		sm.setBirthday("02/09/1992");
		sm.setAddress("Hi-way, Yati, Liloan Cebu");
		sm.setPhoneNo("332-424-955");
		sm.setSssNo("26-7145133-4");
		sm.setPhilHealthNo("601644902402");
		sm.setTinNo("404-768-309-000");
		sm.setPagibigNo("697764069311");
		sm.setStatus("Regular");
		sm.setPosition("Sales & Marketing");
		sm.setSupervisor(cmo.getLastName() + " , " + cmo.getFirstName());
		sm.setBasicSalary(52670);
		sm.setRiceSubsidy(1500);
		sm.setPhoneAllowance(1000);
		sm.setClothingAllowance(1000);
		sm.setSemiMonthlyRate(26335);
		sm.setHourlyRate(313.51);

		Employee scl = new Employee();
		scl.setEmpNo("10033");
		scl.setLastName("Martinez");
		scl.setFirstName("JCarlos Ian");
		scl.setBirthday("11/16/1990");
		scl.setAddress("Bulala, Camalaniugan");
		scl.setPhoneNo("078-854-208");
		scl.setSssNo("11-5062972-7");
		scl.setPhilHealthNo("380685387212");
		scl.setTinNo("256-436-296-000");
		scl.setPagibigNo("993372963726");
		scl.setStatus("Regular");
		scl.setPosition("Supply Chain and Logistics");
		scl.setSupervisor(cmo.getLastName() + " , " + cmo.getFirstName());
		scl.setBasicSalary(52670);
		scl.setRiceSubsidy(1500);
		scl.setPhoneAllowance(1000);
		scl.setClothingAllowance(1000);
		scl.setSemiMonthlyRate(26335);
		scl.setHourlyRate(313.51);

		Employee csr = new Employee();
		csr.setEmpNo("10034");
		csr.setLastName("Santos");
		csr.setFirstName("Beatriz");
		csr.setBirthday("08/07/1990");
		csr.setAddress("Agapita Building, Metro Manila");
		csr.setPhoneNo("526-639-511");
		csr.setSssNo("20-2987501-5");
		csr.setPhilHealthNo("918460050077");
		csr.setTinNo("911-529-713-000");
		csr.setPagibigNo("874042259378");
		csr.setStatus("Regular");
		csr.setPosition("Customer Service and Relations");
		csr.setSupervisor(cmo.getLastName() + " , " + cmo.getFirstName());
		csr.setBasicSalary(52670);
		csr.setRiceSubsidy(1500);
		csr.setPhoneAllowance(1000);
		csr.setClothingAllowance(1000);
		csr.setSemiMonthlyRate(26335);
		csr.setHourlyRate(313.51);

		employeesMPH = new Employee[] { ceo, coo, cfo,
				cmo, itops, hrMgr, hrTM, hrRF1, hrRF2, acctgHead,
				payrollMgr, payrollTL, payrollRF1, payrollRF2, acctMgr, acctTL1, acctTL2,
				acctRF1, acctRF2, acctRF3, acctRF4, acctRF5, acctRF6, acctRF7,
				acctRF8, acctRF9, acctRF10, acctRF11, acctRF12, acctRF13, acctRF14,
				acctRF15, sm, scl, csr };
	}

	public Employee[] getEmployeeModelList() {
		return employeesMPH;
	}

}
