'''
You should be able to run this script in a folder which contains
downloaded grade reports from Canvas.

The script should calculate GPAs and both print to the screen
as well as to an output file the final gpa score to be entered
into instructor briefcase.
'''

import os, csv, math

def gpa(decimal):
    # this is the GPA mapping, you can alter. Format is:
    # decimal : gpa,
    map = {100 : 4.0, 99 : 4.0, 98 : 4.0, 97 : 4.0, 96 : 4.0, 95 : 4.0,
           94 : 3.9, 93 : 3.8, 92 : 3.7, 91 : 3.6, 90 : 3.5,
           89 : 3.4, 88 : 3.4, 87 : 3.3, 86 : 3.3, 85 : 3.2, 84 : 3.2,
           83 : 3.1, 82 : 3.1, 81 : 3.0, 80 : 3.0, 79 : 2.9, 78 : 2.9,
           77 : 2.8, 76 : 2.8, 75 : 2.7, 74 : 2.7, 73 : 2.6, 72 : 2.5,
           71 : 2.4, 70 : 2.3, 69 : 2.2, 68 : 2.1, 67 : 2.0, 66 : 1.9,
           65 : 1.8, 64 : 1.7, 63 : 1.6, 62 : 1.6, 61 : 1.5, 60 : 1.5,
           59 : 1.4, 58 : 1.4, 57 : 1.3, 56 : 1.3, 55 : 1.2, 54 : 1.2,
           53 : 1.1, 52 : 1.1, 51 : 1.0, 50 : 1.0, 49 : 0.9}

    # returns the gpa, 0.0 if not in the map
    return map.get(decimal) if decimal in map else 0.0

def c_round(per):
    if per % 1 >= 0.5:
        return math.ceil(per)
    else:
        return math.floor(per)

def process(file,output):
    # opens output file
    out = open(output,'w')
    class_gpa = []
    bell = [0,0,0,0,0]

    # opens the input file (file)
    with open(file, 'r') as csvfile:
        reader = csv.DictReader(csvfile)
        # writes the header row
        out.write('GPA,NAME,DECIMAL\n')
        # cycles through all the students in the report
        for row in reader:
            student = row['Student']
            #print(student)
            # as long as it's not the weird extra row
            if student != "" and student.find("Points") == -1 and student != "Test Student":
                grade = float(row['Current Score'])
                if grade > 100:
                    grade = 100
                # rounds and int's the decimal grade for lookup using gpa function
                gpa_grade = '{0:.2}'.format(gpa(int(c_round(grade))))
                # prints to screen
                print(str(gpa_grade) + '\t' + str(grade) + '\t' + student)
                # writes to output file
                out.write(gpa_grade + ',' + student + ',' + str(grade) + '\n')

                # calculates class stats
                class_gpa += [float(gpa_grade)]
                if grade >= 90:
                    bell[0] += 1
                elif grade >= 80:
                    bell[1] += 1
                elif grade >= 70:
                    bell[2] += 1
                elif grade >= 66:
                    bell[3] += 1
                else:
                    bell[4] += 1
    avg = 0
    for c in class_gpa:
        avg += c
    avg = avg / len(class_gpa)
    out.write("\n\n,average gpa," + str(avg))
    out.write("\n,As," + str(bell[0]))
    out.write("\n,Bs," + str(bell[1]))
    out.write("\n,Cs," + str(bell[2]))
    out.write("\n,Ds," + str(bell[3]))
    out.write("\n,Fs," + str(bell[4]))
    out.close()

#---------------------------
for file in os.listdir('.'):
    if file.endswith('.csv') and file.startswith('GRADE_REPORT_') == False:
        output = 'GRADE_REPORT_' + file[file.index('-')+1:].replace('_','')
        print('Processing: ' + file)
        process(file, output)
        print("\n")
