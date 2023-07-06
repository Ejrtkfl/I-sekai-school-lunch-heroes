import json
import matplotlib.pyplot as plt

plt.rc('font', size = 12)
plt.rc('axes', unicode_minus = False)
plt.rcParams['font.family'] = 'Malgun Gothic'


fig = plt.figure(figsize = (10, 5))
ax = fig.add_subplot(1, 1, 1)

with open('C:\\test.json', 'r') as f:

    json_data = json.load(f)

variant_list=list(range(len(json_data)))
time_list=list(range(len(json_data)))
color_list=list(range(len(json_data)))

for i in range(len(json_data)):
    a=json_data[i]
    b=str(a["variant"])
    c=a["time"]
    variant_list[i]=b+'%'
    time_list[i]=c

for i in range(len(json_data)):
    if time_list[i]==max(time_list):
        color_list[i]='red'
    else:
        color_list[i]='blue'

ax.set_xlabel('변이율', fontsize=16)
ax.set_ylabel('걸린 시간(초)', fontsize=16)
ax.set_title('변이율에 따른 알고리즘 성능 평가', fontsize=20, loc='left')

plt.bar(variant_list, time_list, color = color_list, width = 0.3)
plt.show()
