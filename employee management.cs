using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;


/**/

namespace Solution
{
    public class Solution
    {

        public static Dictionary<string, int> AverageAgeForEachCompany(List<Employee> employees)
        {
            return employees.
            GroupBy(e => e.Company).
            OrderBy(e => e.Key).
            Select(grp => new 
                        {CompanyName = grp.Key, 
                        Average = (int)Math.Round(grp.Average(e => e.Age))
                        }).
            ToDictionary(item => item.CompanyName.ToString(), item=> item.Average);
        }
        
        public static Dictionary<string, int> CountOfEmployeesForEachCompany(List<Employee> employees)
        {
            return employees.
            GroupBy(e => e.Company).
            OrderBy(e => e.Key).
            Select(grp => new 
                        {CompanyName = grp.Key, 
                        Count = (int)grp.Count()
                        }).
            ToDictionary(item => item.CompanyName.ToString(), item => item.Count);
        }
        
        public static Dictionary<string, Employee> OldestAgeForEachCompany(List<Employee> employees)
        {
            return employees.
            GroupBy(e => e.Company).
            OrderBy(e => e.Key).
            Select(grp => new 
                        {CompanyName = grp.Key, 
                         Emp = employees.Where(p => p.Company == grp.Key && p.Age == (int)grp.Max(e => e.Age)).FirstOrDefault()
                        }).ToDictionary(item => item.CompanyName.ToString(), item => item.Emp);            
        }

        public static void Main()
        {   
            int countOfEmployees = int.Parse(Console.ReadLine());
            
            var employees = new List<Employee>();
            
            for (int i = 0; i < countOfEmployees; i++)
            {
                string str = Console.ReadLine();
                string[] strArr = str.Split(' ');
                employees.Add(new Employee { 
                    FirstName = strArr[0], 
                    LastName = strArr[1], 
                    Company = strArr[2], 
                    Age = int.Parse(strArr[3]) 
                    });
            }
            
            foreach (var emp in AverageAgeForEachCompany(employees))
            {
                Console.WriteLine($"The average age for company {emp.Key} is {emp.Value}");
            }
            
            foreach (var emp in CountOfEmployeesForEachCompany(employees))
            {
                Console.WriteLine($"The count of employees for company {emp.Key} is {emp.Value}");
            }
            
            foreach (var emp in OldestAgeForEachCompany(employees))
            {
                Console.WriteLine($"The oldest employee of company {emp.Key} is {emp.Value.FirstName} {emp.Value.LastName} having age {emp.Value.Age}");
            }
        }
    }
    
    public class Employee
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public int Age { get; set; }
        public string Company { get; set; }
    }
}   